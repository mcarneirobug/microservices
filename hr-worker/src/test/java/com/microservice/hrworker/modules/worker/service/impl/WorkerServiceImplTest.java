package com.microservice.hrworker.modules.worker.service.impl;


import com.microservice.hrworker.HrWorkerApplication;
import com.microservice.hrworker.modules.fake.FakeWorker;
import com.microservice.hrworker.modules.worker.service.WorkerService;
import javassist.NotFoundException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest(
        classes = HrWorkerApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
public class WorkerServiceImplTest {

    @MockBean
    private WorkerRepository repository;

    @Autowired
    private WorkerService workerService;

    @Test
    void shouldFindAllWorkers() {

        final var worker = FakeWorker.generate();

        when(this.repository.findAll()).thenReturn(List.of(worker));

        final var response = this.workerService.findAll();
        assertNotNull(response);

        verify(this.repository, times(1)).findAll();
    }

    @Test
    void shouldGetById() throws NotFoundException {

        final var worker = FakeWorker.generate();

        when(this.repository.findById(anyLong())).thenReturn(Optional.of(worker));

        final var response = this.workerService.getById(1L);
        assertNotNull(response);

        verify(this.repository, times(1)).findById(anyLong());
    }

    @Test
    void shouldGetByIdWhenNotFoundExceptionExists() {

        when(this.repository.findById(anyLong())).thenReturn(Optional.empty());

        final var exception = assertThrows(NotFoundException.class, () ->
                this.workerService.getById(1L),
                "Deve retornar um NotFoundException.");

        assertNotNull(exception);
        assertTrue(exception.getMessage().contains("Error: Não foi encontrado um Worker para o Id informado."));

        verify(this.repository, times(1)).findById(anyLong());
    }
}