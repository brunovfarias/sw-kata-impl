package br.com.gersonkm.swkata.datetime.dat_000;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;

public class DAT_000_A_Java implements DAT_000_A {

    @NotNull @Override
    public LocalDate solve(@NotNull LocalDate data) {
        return data.plusDays(1);
    }

}
