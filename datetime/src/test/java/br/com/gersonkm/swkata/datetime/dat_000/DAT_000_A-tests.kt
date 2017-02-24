package br.com.gersonkm.swkata.datetime.dat_000

import br.com.gersonkm.swkata.datetime.helpers.DateTimeTestHelper.newLocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

abstract class DAT_000_A_Tests(val SUT: DAT_000_A) {

    @Test
    fun `próxima data no mesmo mês`() {
        val result = SUT.solve(newLocalDate("05/01/2017"))
        assertThat(result).isEqualTo(newLocalDate("06/01/2017"))
    }

    @Test
    fun `próxima data em outro mês`() {
        val result = SUT.solve(newLocalDate("28/02/2017"))
        assertThat(result).isEqualTo(newLocalDate("01/03/2017"))
    }

}

class DAT_000_A_Java_Tests : DAT_000_A_Tests(DAT_000_A_Java())
class DAT_000_A_Kotlin_Tests : DAT_000_A_Tests(DAT_000_A_Kotlin())