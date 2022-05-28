package co.com.masconsulta.Payroll.repository;

import co.com.masconsulta.Payroll.domain.Pais;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class PaisRepositoryTest {
    @Autowired
    private PaisRepository paisRepository;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @Order(1)
    void insert(){
        Pais pais01 =new Pais();
        pais01.setCodigopais("169");
        pais01.setNombrepais("Colombia");
        this.paisRepository.save(pais01);

        Pais pais02 =new Pais();
        pais02.setCodigopais("280");
        pais02.setNombrepais("Estados Unidos");
        this.paisRepository.save(pais02);

        Pais pais03 =new Pais();
        pais03.setCodigopais("500");
        pais03.setNombrepais("Alemania");
        this.paisRepository.save(pais03);

    }

    @Test
    @Order(2)
    void update(){
        Optional <Pais>pais01Optional=this.paisRepository.findById(1l);
        pais01Optional.get().setCodigopais("101");
        pais01Optional.get().setNombrepais("Republica de Colombia");
        this.paisRepository.save(pais01Optional.get());

        Optional <Pais>pais02Optional=this.paisRepository.findById(2l);
        pais02Optional.get().setCodigopais("102");
        pais02Optional.get().setNombrepais("USA");
        this.paisRepository.save(pais02Optional.get());

        Optional <Pais>pais03Optional=this.paisRepository.findById(3l);
        pais03Optional.get().setCodigopais("103");
        pais03Optional.get().setNombrepais("German");
        this.paisRepository.save(pais01Optional.get());


    }

    @Test
    @Order(3)
    void delete() {
        this.paisRepository.delete(
                this.paisRepository.getById(1l));
        this.paisRepository.delete(
                this.paisRepository.getById(2l));
        this.paisRepository.delete(
                this.paisRepository.getById(3l));

            }
}