package com.example.hanghaememo.service;

import com.example.hanghaememo.dto.MemoRequestDto;
import com.example.hanghaememo.entity.Memo;
import com.example.hanghaememo.repository.MemoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class MemoService {
    private final MemoRepository memoRepository;

    @Transactional
    public Memo createMemo(MemoRequestDto requestDto) {
        Memo memo = new Memo(requestDto);
        memoRepository.save(memo);
        return memo;
    }
}
