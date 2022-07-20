package com.koreait.day4.service;

import com.koreait.day4.model.entity.Item;
import com.koreait.day4.model.network.Header;
import com.koreait.day4.model.network.request.ItemApiRequest;
import com.koreait.day4.model.network.response.ItemApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemApiLogicService extends BaseService<ItemApiRequest, ItemApiResponse, Item>{

    @Override
    public Header<ItemApiResponse> create(Header<ItemApiRequest> request) {
//        ItemApiRequest itemApiRequest = request.getData();
//        Item item = Item.builder().name(itemApiRequest.getName())
//                .status(ItemStatus.REGISTERED)
//                .title(itemApiRequest.getTitle())
//                .content(itemApiRequest.getContent())
//                .price(itemApiRequest.getPrice())
//                .regDate(LocalDateTime.now())
//                .build();
//        Item newItem = baseRepository.save(item);
//
//        return Header.OK(response(newItem));
        return null;
    }

    @Override
    public Header<ItemApiResponse> read(Long id) {
        return null;
    }

    @Override
    public Header<ItemApiResponse> update(Header<ItemApiRequest> request) {
        return null;
    }

    @Override
    public Header<ItemApiResponse> delete(Long id) {
        return null;
    }

    public Header<ItemApiResponse> response(Item item){
        ItemApiResponse itemApiResponse = ItemApiResponse.builder()
                .id(item.getId())
                .name(item.getName())
                .status(item.getStatus())
                .title(item.getTitle())
                .content(item.getContent())
                .price(item.getPrice())
                .regDate(item.getRegDate())
                .partnerId(item.getPartner().getId())
                .build();
        return Header.OK(itemApiResponse);
    }
}
