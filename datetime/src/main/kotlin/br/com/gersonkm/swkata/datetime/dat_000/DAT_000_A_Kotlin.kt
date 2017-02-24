package br.com.gersonkm.swkata.datetime.dat_000

import ru.yole.kxdate.days
import java.time.LocalDate

class DAT_000_A_Kotlin : DAT_000_A {

    override fun solve(data: LocalDate): LocalDate = data + 1.days

}