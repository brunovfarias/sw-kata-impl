package br.com.gersonkm.swkata.datetime.dat_002;

import com.google.common.collect.Range;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

public class DAT_002_A_Java implements DAT_002_A {

    @NotNull @Override
    public List<LocalDate> solve(@NotNull Range<YearMonth> monthInterval) {
        LocalDate dataInicial = monthInterval.lowerEndpoint().atDay(1);
        LocalDate dataFinal = monthInterval.upperEndpoint().atEndOfMonth();
        ArrayList<LocalDate> lista = new ArrayList<>();

        for (LocalDate date = dataInicial; date.isBefore(dataFinal); date = date.plusDays(1)) {
            lista.add(date);
        }

        return lista;
    }



}

