package com.ant.toolkit.service.response;


import com.ant.toolkit.exception.IError;
import java.util.List;

/**
 * @author vam
 * @version 1.0
 * @date 2019-06-20 15:29
 *
 */
public class ResultUtil {


  private static final Integer SUCCESS_CODE = 0;

  private static final String SUCCESS_MSG = "success";


  public static <T> BaseResult createSuccessResult(T t) {

    return createSuccessResult(t, new IError() {
      public String getMessage() {
        return SUCCESS_MSG;
      }

      public int getCode() {
        return SUCCESS_CODE;
      }
    });
  }

  public static <T> BaseResult createSuccessResult(T t, IError error) {


    if (t instanceof Boolean) {
      BaseResult result = new BaseResult();
      result.setCode(error.getCode());
      result.setMessage(error.getMessage());
      result.setSuccess(true);
      return result;
    } else {
      PlainResult<T> result = new PlainResult();
      result.setData(t);
      result.setCode(error.getCode());
      result.setMessage(error.getMessage());
      result.setSuccess(true);
      return result;
    }
  }

  public static BaseResult createFailResult(IError error) {

    BaseResult result = new BaseResult();
    result.setCode(error.getCode());
    result.setMessage(error.getMessage());
    result.setSuccess(false);
    return result;
  }


  public static <T> ListResult<T> createSuccessResult(List<T> t, Integer pageSize, Integer pageNo, Integer total) {

    return createSuccessResult(t, pageSize, pageNo, total, new IError() {
      public String getMessage() {
        return SUCCESS_MSG;
      }

      public int getCode() {
        return SUCCESS_CODE;
      }
    });
  }

  public static <T> ListResult<T> createSuccessResult(List<T> t, Integer pageSize, Integer pageNo, Integer total,
                                                      IError error) {

    ListResult result = new ListResult();
    Paginator paginator = new Paginator(pageNo, pageSize, total);
    result.setPaginator(paginator);
    result.setData(t);
    result.setCode(error.getCode());
    result.setMessage(error.getMessage());
    result.setSuccess(true);
    return result;
  }


}
