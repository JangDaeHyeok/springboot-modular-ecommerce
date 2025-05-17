package com.modularEcommerce.modulestructure;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;

class ModulithStructureTest {

    @Test
    void verifyModularStructure() {
        ApplicationModules modules = ApplicationModules.of("com.modularEcommerce");
        modules.verify(); // 모듈 간 순환 참조나 잘못된 접근이 있으면 실패
    }
}
