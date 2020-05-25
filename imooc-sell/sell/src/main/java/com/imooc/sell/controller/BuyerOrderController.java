package com.imooc.sell.controller;

import com.imooc.sell.converter.OrderForm2DTOConverter;
import com.imooc.sell.converter.OrderMaster2DTOConverter;
import com.imooc.sell.dto.OrderDTO;
import com.imooc.sell.enums.ResultEnum;
import com.imooc.sell.exception.SellException;
import com.imooc.sell.form.OrderForm;
import com.imooc.sell.service.BuyerService;
import com.imooc.sell.service.OrderService;
import com.imooc.sell.utils.ResultVOUtil;
import com.imooc.sell.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: 买家订单controller
 * @author: wtx
 * @createDate: 2020/5/23
 */
@RestController
@Slf4j
@RequestMapping("/buyer/order")
public class BuyerOrderController {

    @Autowired
    private OrderService orderService;
    @Autowired
    private BuyerService buyerService;

    //创建订单 ===========================================
    @PostMapping("/create")
    public ResultVO<Map<String,String>> create(@Valid OrderForm orderForm,
                                               BindingResult bindingResult){
        //判断表单是否错误
        if (bindingResult.hasErrors()){
            log.error("【创建订单】参数错误, orderForm={}",orderForm);
            throw new SellException(ResultEnum.PARAM_ERROR.getCode(),
                    bindingResult.getFieldError().getDefaultMessage());
        }
        OrderDTO orderDTO = OrderForm2DTOConverter.convert(orderForm);
        if (CollectionUtils.isEmpty(orderDTO.getOrderDetailList())){
            log.error("【创建订单】购物车不能为空");
            throw new SellException(ResultEnum.CART_EMPTY);
        }
        OrderDTO retDTO = orderService.create(orderDTO);
        Map<String,String> map = new HashMap<>();
        map.put("orderId",retDTO.getOrderId());

        return ResultVOUtil.success(map);
    }

    //订单列表 ===========================================
    @GetMapping("/list")
    public ResultVO<List<OrderDTO>> list(@RequestParam("openid")String openid,
                                         @RequestParam(value = "page",defaultValue = "0")Integer page,
                                         @RequestParam(value = "size",defaultValue = "10")Integer size){

        if (StringUtils.isEmpty(openid)){
            log.error("【查询订单列表】openid为空");
            throw new SellException(ResultEnum.PARAM_ERROR);
        }

        PageRequest request = new PageRequest(page,size);
        Page<OrderDTO> list = orderService.findList(openid, request);
        //前端要求的日期是long，单位为秒，这里使用的是date，会自动被转成long，毫秒,怎么办？-->序列化器!
        return ResultVOUtil.success(list.getContent() );
    }

    //查看单个订单 =========================================
    @GetMapping("/detail")
    public ResultVO<OrderDTO> detail(@RequestParam("openid") String openid,
                                     @RequestParam("orderId") String orderId){

        OrderDTO orderDTO = buyerService.findOrderOne(openid, orderId);
        return ResultVOUtil.success(orderDTO);
    }

    //取消订单 ===========================================
    @PostMapping("/cancel")
    public ResultVO cancel(@RequestParam("openid") String openid,
                                     @RequestParam("orderId") String orderId){

        buyerService.cancel(openid, orderId);
        return ResultVOUtil.success();
    }
}








