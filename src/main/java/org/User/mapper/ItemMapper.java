package org.User.mapper;

import org.User.model.Item;

import java.util.List;

public interface ItemMapper {
    int insert(Item record);
    List<Item> selectAll();
}