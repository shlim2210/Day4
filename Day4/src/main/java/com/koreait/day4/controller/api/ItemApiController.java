package com.koreait.day4.controller.api;

import com.koreait.day4.controller.CrudController;
import com.koreait.day4.model.entity.Item;
import com.koreait.day4.model.network.Header;
import com.koreait.day4.model.network.request.ItemApiRequest;
import com.koreait.day4.model.network.response.ItemApiResponse;
import com.koreait.day4.service.ItemApiLogicService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/item")    // http://localhost:9090/api/item
@RequiredArgsConstructor
public class ItemApiController extends CrudController<ItemApiRequest, ItemApiResponse, Item> {

    /*
                 {
                    "transaction_time":"2022-07-12",
                    "resultCode":"ok",
                    "description":"ok",
                    "data":{
                        "name":"엘지 공기청정기",
                        "title":"공기청정기",
                        "content":"너무 좋아요",
                        "price":900000
                    }
                }
     */
    private final ItemApiLogicService itemApiLogicService;

    @Override
    @PostMapping("") // http://localhost:9090/api/item (post)
    public Header<ItemApiResponse> create(@RequestBody Header<ItemApiRequest> request) {
        return itemApiLogicService.create(request);
    }

    @Override
    public Header<ItemApiResponse> read(Long id) {
        return itemApiLogicService.read(id);
    }

    @Override
    public Header<ItemApiResponse> update(Header<ItemApiRequest> request) {
        return itemApiLogicService.update(request);
    }

    @Override
    public Header<ItemApiResponse> delete(Long id) {
        return itemApiLogicService.delete(id);
    }
}
