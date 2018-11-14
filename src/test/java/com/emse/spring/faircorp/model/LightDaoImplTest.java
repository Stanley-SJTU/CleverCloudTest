package com.emse.spring.faircorp.model;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.groups.Tuple.tuple;


@RunWith(SpringRunner.class)
@DataJpaTest
@ComponentScan
public class LightDaoImplTest {

    @Autowired
    LightDaoCustom lightDao;

    @Test
    public void shouldFindOnLights() {
        Assertions.assertThat(lightDao.findOnLights())
                .hasSize(1)
                .extracting("id", "status")
                .containsExactly(tuple(-1L, Status.ON));
    }
}
