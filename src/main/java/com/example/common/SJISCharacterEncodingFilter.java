package com.example.common;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.web.servlet.filter.OrderedCharacterEncodingFilter;

/** Shift-JISを受け付けるためのフィルタ */
public class SJISCharacterEncodingFilter extends OrderedCharacterEncodingFilter {

  /**
   * @see
   *     org.springframework.web.filter.CharacterEncodingFilter#doFilterInternal(javax.servlet.http.HttpServletRequest,
   *     javax.servlet.http.HttpServletResponse, javax.servlet.FilterChain)
   */
  @Override
  protected void doFilterInternal(
      HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
      throws ServletException, IOException {
    super.setOrder(HIGHEST_PRECEDENCE);
    System.out.print(request.getRequestURI());
    if (StringUtils.equals("/controller/post_method", request.getRequestURI())) {
      super.setEncoding("Shift_JIS");
    } else {
      super.setEncoding("UTF-8");
    }
    super.setForceEncoding(true);
    super.doFilterInternal(request, response, filterChain);
  }
}
