package br.com.gersonkm.swkata.datetime.dat_002

import com.google.common.collect.Range
import java.time.LocalDate
import java.time.YearMonth

class DAT_002_A_Kotlin : DAT_002_A {

    override fun solve(monthInterval: Range<YearMonth>): List<LocalDate> {
        val dataInicial = monthInterval.lowerEndpoint().atDay(1);
        val dataFinal = monthInterval.upperEndpoint().atEndOfMonth();
        val lista = ArrayList<LocalDate>();

        var date = dataInicial
        while (date.isBefore(dataFinal.plusDays(1))) {
            lista.add(date)
            date = date.plusDays(1)
        }
        return lista;
    }
}