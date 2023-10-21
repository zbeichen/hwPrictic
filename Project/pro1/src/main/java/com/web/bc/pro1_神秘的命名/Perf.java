package com.web.bc.pro1_神秘的命名;

import lombok.Data;

@Data
public class Perf {
    /**
     * 人数
     */
    private Integer Aud;

    public Perf(Integer aud) {
        Aud = aud;
    }
}
