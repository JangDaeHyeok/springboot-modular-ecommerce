package com.modularEcommerce.modulestructure;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.core.DependencyDepth;
import org.springframework.modulith.docs.Documenter;

class ModulithDocumentationTest {

    @Test
    void createModuleDocumentation() {
        ApplicationModules modules = ApplicationModules.of("com.modularEcommerce");

        new Documenter(modules)
                .writeModulesAsPlantUml(
                        Documenter.DiagramOptions.defaults()
                                .withDependencyDepth(DependencyDepth.ALL)
                                .withElementsWithoutRelationships(Documenter.DiagramOptions.ElementsWithoutRelationships.VISIBLE) // ⭐ 고립 모듈도 표시
                                // .withStyle(Documenter.DiagramOptions.DiagramStyle.UML) // uml style
                )
                .writeIndividualModulesAsPlantUml();
    }

    @Test
    void printModules() {
        ApplicationModules modules = ApplicationModules.of("com.modularEcommerce");

        modules.stream().forEach(it -> System.out.println(it.getName()));
    }

}
