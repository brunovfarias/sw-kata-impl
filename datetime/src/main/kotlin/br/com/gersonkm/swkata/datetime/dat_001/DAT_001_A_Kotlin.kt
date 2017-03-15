package br.com.gersonkm.swkata.datetime.dat_001

import org.threeten.extra.Days
import org.threeten.extra.Weeks
import java.time.DayOfWeek
import java.time.LocalDate
import java.time.temporal.TemporalAdjusters

class DAT_001_A_Kotlin : DAT_001_A {

    override fun solve(data: LocalDate, semanas: Weeks, dias: Days, forcaDiaUtil: Boolean, diaUtilPadrao: DayOfWeek): LocalDate {
        if (forcaDiaUtil && (diaUtilPadrao == DayOfWeek.SATURDAY || diaUtilPadrao == DayOfWeek.SUNDAY)){
            throw IllegalArgumentException()
        }

       val dataCalculada =  data.plusWeeks(semanas.amount.toLong()).plusDays(dias.amount.toLong())

        if (forcaDiaUtil && (dataCalculada.getDayOfWeek() == DayOfWeek.SATURDAY || dataCalculada.getDayOfWeek() == DayOfWeek.SUNDAY)) {
            return dataCalculada.with(TemporalAdjusters.next(diaUtilPadrao))
        }
        return dataCalculada
    }
}