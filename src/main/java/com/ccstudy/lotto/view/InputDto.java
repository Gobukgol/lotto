package com.ccstudy.lotto.view;

import com.ccstudy.lotto.domain.LottoNo;
import com.ccstudy.lotto.domain.LottoTicket;

import java.util.List;

public class InputDto {
    private Integer manualAmountOfLotto;
    private List<String> manualLottoNumbers;

    public InputDto(Integer manualAmountOfLotto, List<String> manualLottoNumbers) {
        this.manualAmountOfLotto = manualAmountOfLotto;
        this.manualLottoNumbers = manualLottoNumbers;
    }

    public Integer getManualAmountOfLotto() {
        return manualAmountOfLotto;
    }

    public List<String> getManualLottoNumbers() {
        return manualLottoNumbers;
    }
}
