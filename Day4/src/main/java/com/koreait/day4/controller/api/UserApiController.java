package com.koreait.day4.controller.api;

import com.koreait.day4.controller.CrudController;
import com.koreait.day4.model.entity.Users;
import com.koreait.day4.model.network.Header;
import com.koreait.day4.model.network.request.UserApiRequest;
import com.koreait.day4.model.network.response.UserApiResponse;
import com.koreait.day4.model.network.response.UserOrderInfoApiResponse;
import com.koreait.day4.service.UserApiLogicService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")    // http://localhost:8080/api/user
@RequiredArgsConstructor
public class UserApiController extends CrudController<UserApiRequest, UserApiResponse, Users> {
    private final UserApiLogicService userApiLogicService;
    /*
                {
                    "transaction_time":"2022-07-12",
                    "resultCode":"ok",
                    "description":"ok",
                    "data":{
                        "userid":"ryu",
                        "userpw":"1111",
                        "email":"ryu@naver.com",
                        "hp":"010-1111-1111"
                    }
                }
     */

    @Override
    @PostMapping("") // http://localhost:8080/api/user (post)
    public Header<UserApiResponse> create(@RequestBody Header<UserApiRequest> request) {
        System.out.println("들어옴2");
        return userApiLogicService.create(request);
    }

    @Override
    @GetMapping("{id}") // http://localhost:8080/api/user/{id} (get)
    public Header<UserApiResponse> read(@PathVariable(name="id") Long id) {
        return userApiLogicService.read(id);
    }

    @Override
    @PutMapping("") // http://localhost:9090/api/user (put)
    public Header<UserApiResponse> update(@RequestBody Header<UserApiRequest> request) {
        return userApiLogicService.update(request);
    }

    @Override
    @DeleteMapping("{id}") // http://localhost:9090/api/user/{id} (delete)
    public Header<UserApiResponse> delete(@PathVariable Long id) {
        return userApiLogicService.delete(id);
    }

    @GetMapping("") // http://localhost:9090/api/user?page=1
    public Header<List<UserApiResponse>> findAll(@PageableDefault(sort = {"id"}, direction = Sort.Direction.DESC)Pageable pageable){
        return userApiLogicService.search(pageable);
    }

    @GetMapping("/{id}/orderInfo")  // http://localhost:9090/api/user/24/orderInfo (get)
    public Header<UserOrderInfoApiResponse> orderInfo(@PathVariable Long id){
        return userApiLogicService.orderInfo(id);
    }

}
