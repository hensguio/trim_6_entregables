package co.com.masconsulta.Payroll.repository;

import co.com.masconsulta.Payroll.domain.Alergias;
import co.com.masconsulta.Payroll.domain.MasterSalud;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class MasterSaludRepositoryTest {
    @Autowired
    private MasterSaludRepository masterSaludRepository;


    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @Order(1)
    void insert() {
        MasterSalud masterSalud01 = new MasterSalud();
        masterSalud01.setCodigoEps("8054S");
        masterSalud01.setNit(900330888);
        masterSalud01.setDv(1);
        masterSalud01.setNombreEps("Sanitas EPS");
        this.masterSaludRepository.save(masterSalud01);

    }



    @Test
    @Order(2)
    void update() {
        Optional<MasterSalud> masterSalud01optional = this.masterSaludRepository.findById(1l);
        masterSalud01optional.get().setCodigoEps("8055S");
        masterSalud01optional.get().setNit(900800700);
        masterSalud01optional.get().setDv(2);
        masterSalud01optional.get().setNombreEps("Sanitas EPS SA");
        this.masterSaludRepository.save(masterSalud01optional.get());

    }




    @Test
    @Order(3)
    void delete() {
        this.masterSaludRepository.delete(
                this.masterSaludRepository.getById(1l)
        );
    }


}