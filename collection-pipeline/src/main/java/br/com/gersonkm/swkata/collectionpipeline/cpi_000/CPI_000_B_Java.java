package br.com.gersonkm.swkata.collectionpipeline.cpi_000;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.stream.Collectors;

public class CPI_000_B_Java implements CPI_000_B {

    @NotNull @Override
    public String solve(@NotNull List<CoffeeBrand> coffeeBrands) {
        return coffeeBrands.stream()
                .map(CoffeeBrand::getName)
                .collect(Collectors.joining(", "));
    }
}