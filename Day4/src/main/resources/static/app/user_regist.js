

$(function(){
    $(document).on('click', '#sendit', function(){
       if(!$('#userid').val()){
           alert("아이디를 입력하세요");
           $('#userid').focus();
           return false;
       }

        if(!$('#userpw').val()){
            alert("비밀번호를 입력하세요");
            $('#userpw').focus();
            return false;
        }

        if(!$('#hp').val()){
            alert("전화번호를 입력하세요");
            $('#hp').focus();
            return false;
        }

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


        //    javascript 객체로 json 형태를 만든거. json 자체는 아님
        let jsonData = {
            transaction_time: new Date(),
            resultCode:"ok",
            description:"ok",
            data:{
                userid: $('#userid').val(),
                userpw:$('#userpw').val(),
                email:$('#email').val(),
                hp:$('#hp').val()
            }
        }

        $.post({
            url: '/api/user',
            type : 'POST',
            dataType : 'json',
            data : JSON.stringify(jsonData),
            contentType: 'application/json',
            success: function(){
                alert("등록 성공!");
                location.href='/pages/user';
            },

            error: function(){
                alert("등록 실패!");
                location.reload();
            }
            // contentType: 'application/json'
        });


    });
});