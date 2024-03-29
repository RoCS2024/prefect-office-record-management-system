package com.prefect.office.record.management.data.dao.prefect.communityservice.impl;

import com.prefect.office.record.management.appl.model.communityservice.CommunityService;
import com.prefect.office.record.management.data.dao.prefect.communityservice.CommunityServiceDao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


class CommunityServiceDaoImplTest {
    private CommunityServiceDao communityServiceDao;
    private List<CommunityService> communityServices;

    @BeforeEach
    public void setUp() {
        communityServices = new ArrayList<>();
        CommunityService communityService1 = new CommunityService();
        CommunityService communityService2 = new CommunityService();
        communityServices.add(communityService1);
        communityServices.add(communityService2);

        communityServiceDao = mock(CommunityServiceDao.class);
    }

    @Test
    public void testGetAllCs() {
        when(communityServiceDao.getAllCs()).thenReturn(communityServices);
        List<CommunityService> communityServiceList = communityServiceDao.getAllCs();
        assertEquals(communityServiceList.size(), 2);
    }

    @Test
    public void testGetCsById() {
        CommunityService communityService1 = new CommunityService();
        communityService1.setId(1);

        when(communityServiceDao.getCsById(1)).thenReturn(communityService1);

        CommunityService expectedCommunityService = communityServiceDao.getCsById(1);

        assertEquals(expectedCommunityService, communityService1);
        assertEquals(expectedCommunityService.getId(), communityService1.getId());
    }
    @Test
    public void testRenderCs() {
        CommunityService communityService = new CommunityService();
        communityService.setId(1);

        try {
            when(communityServiceDao.renderCs(communityService)).thenReturn(true);
            when(communityServiceDao.getCsById(1)).thenReturn(communityService);

            CommunityService expectedCommunityService = communityServiceDao.getCsById(1);
            assertEquals(expectedCommunityService.getId(), communityService.getId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}