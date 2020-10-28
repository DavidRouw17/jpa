package dao;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class FietsDaoTest {

    @Mock
    private EntityManager emMock;

    @InjectMocks
    private FietsDao daoMock;



    @Test
    void insert() {
    }

    @Test
    void find() {
    }
}