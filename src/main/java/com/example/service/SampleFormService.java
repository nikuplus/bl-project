package com.example.service;

import com.example.dto.SampleFormRequest;
import com.example.entity.MytableEntity;
import com.example.repository.MyDbRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class SampleFormService {
  private final MyDbRepository myDbRepository;

  /**
   * リクエストをDBに登録する.
   *
   * @param request リクエスト
   * @return 登録結果
   */
  public String setMyTable(SampleFormRequest request) {

    myDbRepository.save(
        MytableEntity.builder()
            .id(Integer.parseInt(request.getSex()))
            .name(request.getName())
            .build());
    return "おっけー,やったー";
  }
}
