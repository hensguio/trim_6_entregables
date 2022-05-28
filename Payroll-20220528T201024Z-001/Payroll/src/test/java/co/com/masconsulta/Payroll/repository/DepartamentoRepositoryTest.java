package co.com.masconsulta.Payroll.repository;

import co.com.masconsulta.Payroll.domain.Departamento;
import co.com.masconsulta.Payroll.domain.Pais;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)


class DepartamentoRepositoryTest {

    @Autowired
    private DepartamentoRepository departamentoRepository;

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

        Departamento departamento01=new Departamento();
        departamento01.setCodigodepartamento("11001");
        departamento01.setNombredepartamento("Bogotá D.C.");
        departamento01.setPais(pais01);
        this.departamentoRepository.save(departamento01);
    }

    @Test
    @Order(2)
    void update(){
        Optional<Pais> pais01Optional=this.paisRepository.findById(1l);
        pais01Optional.get().setCodigopais("101");
        pais01Optional.get().setNombrepais("Republica de Colombia");
        this.paisRepository.save(pais01Optional.get());

        Optional<Departamento> departamento01Optional=this.departamentoRepository.findById(1l);
        departamento01Optional.get().setCodigodepartamento("25001");
        departamento01Optional.get().setNombredepartamento("Cundinamarca");
        this.departamentoRepository.save(departamento01Optional.get());

    }
    @Test
    @Order(3)
    void delete(){
        this.departamentoRepository.delete(
                this.departamentoRepository.getById(1l)

        );

        this.paisRepository.delete(
                this.paisRepository.getById(1l)
        );

    }


}