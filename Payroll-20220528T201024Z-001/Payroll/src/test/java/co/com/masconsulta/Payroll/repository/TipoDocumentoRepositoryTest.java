package co.com.masconsulta.Payroll.repository;

import co.com.masconsulta.Payroll.domain.TipoDocumento;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

// Esto se coloca despues de crear la interface

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)


class TipoDocumentoRepositoryTest {
    @Autowired
    private TipoDocumentoRepository tipoDocumentoRepository;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


    // Esto se coloca despues de crear la interface
    @Test
    @Order(1)
    void insert(){
        TipoDocumento tipoDocumento01 = new TipoDocumento();
        tipoDocumento01.setSigla("CC");
        tipoDocumento01.setDescripcion("Cedula de Ciudadania");
        this.tipoDocumentoRepository.save(tipoDocumento01);

        TipoDocumento tipoDocumento02 = new TipoDocumento();
        tipoDocumento02.setSigla("CE");
        tipoDocumento02.setDescripcion("Cedula de Extranjeria");
        this.tipoDocumentoRepository.save(tipoDocumento02);

        TipoDocumento tipoDocumento03 = new TipoDocumento();
        tipoDocumento03.setSigla("PP");
        tipoDocumento03.setDescripcion("Pasaporte");
        this.tipoDocumentoRepository.save(tipoDocumento03);

        TipoDocumento tipoDocumento04 = new TipoDocumento();
        tipoDocumento04.setSigla("TI");
        tipoDocumento04.setDescripcion("Tarjeta de Identidad");
        this.tipoDocumentoRepository.save(tipoDocumento04);


    }
    @Test
    @Order(2)
    void update(){
        Optional<TipoDocumento>tipoDocumento01optional=this.tipoDocumentoRepository.findById(1l);
        tipoDocumento01optional.get().setDescripcion("Cedula Ciudadania");
        this.tipoDocumentoRepository.save(tipoDocumento01optional.get());

        Optional<TipoDocumento>tipoDocumento02optional=this.tipoDocumentoRepository.findById(2l);
        tipoDocumento02optional.get().setDescripcion("Cedula Extranjeria");
        this.tipoDocumentoRepository.save(tipoDocumento02optional.get());

        Optional<TipoDocumento>tipoDocumento03optional=this.tipoDocumentoRepository.findById(3l);
        tipoDocumento03optional.get().setDescripcion("Pastport");
        this.tipoDocumentoRepository.save(tipoDocumento03optional.get());

        Optional<TipoDocumento>tipoDocumento04optional=this.tipoDocumentoRepository.findById(4l);
        tipoDocumento04optional.get().setDescripcion("Card Identity");
        this.tipoDocumentoRepository.save(tipoDocumento04optional.get());

    }
    @Test
    @Order(3)
    void delete(){
        this.tipoDocumentoRepository.delete(
        this.tipoDocumentoRepository.getById(1l)
        );

        this.tipoDocumentoRepository.delete(
                this.tipoDocumentoRepository.getById(2l)
        );

        this.tipoDocumentoRepository.delete(
                this.tipoDocumentoRepository.getById(3l)
        );

        this.tipoDocumentoRepository.delete(
                this.tipoDocumentoRepository.getById(4l)
        );


    }

}