package co.com.masconsulta.Payroll.repository;

import co.com.masconsulta.Payroll.domain.Alergias;
import co.com.masconsulta.Payroll.domain.TipoDocumento;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)


class AlergiasRepositoryTest {

    @Autowired
    private AlergiasRepository alergiasRepository;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    @Order(1)
    void insert() {
        Alergias alergias01 = new Alergias();
        alergias01.setNombre("Fresas");
        alergias01.setTratamiento("Tomar loratadina con abundante agua");
        this.alergiasRepository.save(alergias01);

            }



    @Test
    @Order(2)
    void update() {
        Optional<Alergias> alergias01Optional = this.alergiasRepository.findById(1l);
        alergias01Optional.get().setNombre("Peras");
        alergias01Optional.get().setTratamiento("Tomar solo agua e ir al medico inmediatamente");
        this.alergiasRepository.save(alergias01Optional.get());
    }


    @Test
    @Order(3)
    void delete() {
        this.alergiasRepository.delete(
                this.alergiasRepository.getById(1l)
        );
    }


}
