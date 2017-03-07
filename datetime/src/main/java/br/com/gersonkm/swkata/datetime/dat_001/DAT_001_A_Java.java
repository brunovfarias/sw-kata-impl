package br.com.gersonkm.swkata.datetime.dat_001;

import org.jetbrains.annotations.NotNull;
import org.threeten.extra.Days;
import org.threeten.extra.Weeks;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

import static java.time.DayOfWeek.SATURDAY;
import static java.time.DayOfWeek.SUNDAY;

public class DAT_001_A_Java implements DAT_001_A {

    @NotNull @Override
    public LocalDate solve(@NotNull LocalDate data, @NotNull Weeks semanas, @NotNull Days dias, boolean forcaDiaUtil, @NotNull DayOfWeek diaUtilPadrao) {
        if( diaUtilPadrao == SATURDAY || diaUtilPadrao == SUNDAY){
            throw new IllegalArgumentException();
        }
        LocalDate dataCalculada = data.plusWeeks(semanas.getAmount()).plusDays(dias.getAmount());

        if (forcaDiaUtil){
            if( dataCalculada.getDayOfWeek() == SATURDAY || dataCalculada.getDayOfWeek() == SUNDAY){
                return dataCalculada.with(TemporalAdjusters.next(diaUtilPadrao));
            }
        }
        return dataCalculada;
    }
}
