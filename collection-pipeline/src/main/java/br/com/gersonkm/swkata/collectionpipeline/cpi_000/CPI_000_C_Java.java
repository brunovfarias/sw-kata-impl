package br.com.gersonkm.swkata.collectionpipeline.cpi_000;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.stream.Collectors;

public class CPI_000_C_Java implements CPI_000_C {

    @NotNull @Override
    public String solve(@NotNull List<CoffeeBrand> coffeeBrands) {
        return coffeeBrands.stream()
                .limit(3)
                .map(coffeeBrand -> coffeeBrand.getName().toUpperCase())
                .collect(Collectors.joining(" / ", "", coffeeBrands.size() > 3 ? " / ..." : ""));
    }
}