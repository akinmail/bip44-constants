package com.akinmail;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Bip44Constant {
    private Long slipIndex;
    private String slipHexadecimal;
    private String coinSymbol;
    private String coinName;
}
