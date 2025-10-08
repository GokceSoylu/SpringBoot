package com.gokcesoylu.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gokcesoylu.dto.DtoHome;
import com.gokcesoylu.dto.DtoRoom;
import com.gokcesoylu.model.Home;
import com.gokcesoylu.model.Room;
import com.gokcesoylu.repository.HomeRepository;
import com.gokcesoylu.services.IHomeService;

@Service
public class HomeServiceImpl implements IHomeService {
    @Autowired
    HomeRepository homeRepository;

    @Override
    public DtoHome getHomeById(long id) {
        Optional<Home> opt = homeRepository.findById(id);
        if (opt.isEmpty())
            return null;
        Home home = opt.get();
        DtoHome dtoHome = new DtoHome();
        BeanUtils.copyProperties(home, dtoHome);
        List<Room> rooms = opt.get().getRoom();
        if (rooms != null && !rooms.isEmpty())
            for (Room room : rooms) {
                DtoRoom dtoRoom = new DtoRoom();
                BeanUtils.copyProperties(room, dtoRoom);
                dtoHome.getRooms().add(dtoRoom);
            }
        return dtoHome;
    }
}
