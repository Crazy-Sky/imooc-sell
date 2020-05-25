package com.imooc.sell.utils;

import com.imooc.sell.vo.ResultVO;

/**
 * @description:
 * @author: wtx
 * @createDate: 2020/5/20
 */
public class ResultVOUtil {

    public static ResultVO success(Object object){

        ResultVO resultVO = new ResultVO();
        resultVO.setMsg("成功");
        resultVO.setCode(0);
        resultVO.setData(object);
        return resultVO;
    }

    public static ResultVO success(){
        return success(null);
    }

    public static ResultVO error(Integer code, String msg){

        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
