package br.com.gersonkm.swkata.collectionpipeline.cpi_000

class CPI_000_C_Kotlin : CPI_000_C {

    override fun solve(coffeeBrands: List<CoffeeBrand>): String {
        return coffeeBrands.joinToString(separator = " / ", limit = 3) { it.name.toUpperCase() }
    }

}