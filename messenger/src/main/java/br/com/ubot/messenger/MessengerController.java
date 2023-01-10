package br.com.ubot.messenger;

import org.jetbrains.annotations.NotNull;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.http.ResponseEntity;

import br.com.ubot.messenger.Message;

import java.util.Map;


@RestController
@RequestMapping

public class MessengerController {

    private final String VERIFY_TOKEN = "12345";
    private final String PAGE_TOKEN = "EAASJtrKNUAABAMZBgOz2awZBD89qbRQIeJsyHTYHsAZBknnIqxYiyv3onyP7UdP7bEAacyx7UIY0Ob7ravPN1OCVJlhCUhxvaSA3xUzNJqsVMIFp1cq6NKRBjD4ZCPVp3E1r74XQ9SWyTKQ5rXlbzrNVytNbzZAYf7yj1HmBtmZBTiJtPz6B02";
    //private final String mode = "subscribe";


    @GetMapping("/messenger")
    public ResponseEntity<Integer> messenger(@RequestParam(value = "hub.mode") String mode,
                                             @RequestParam(value = "hub.verify_token") @NotNull String verify_token,
                                             @RequestParam(value = "hub.challenge") Integer challenge) {
        if (verify_token.equals(VERIFY_TOKEN)) {
            return ResponseEntity.ok(challenge);
        } else {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(null);
        }
    }
/*
    @PostMapping("/messenger")
    @ResponseStatus(HttpStatus.FOUND)
    public Message receiveMessage(@RequestBody Message message){
        System.out.println("ID: "+message.getId());
        System.out.println("Message: "+message.getMessage());
        return message;
    }
*/

    @PostMapping("/messenger")
    public ResponseEntity<String> messenger(@RequestBody ReceiveEvent body) {
        System.out.println(body);
        if (body != null) {
            return ResponseEntity.ok("EVENT_RECEIVED");
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

}







        /*
        if ((mode .equals("subscribe") ) && (verify_token .equals(VERIFY_TOKEN)) {
            System.out.print("WEBHOOK_VERIFIED");
            //return "Status 200";
            return challenge;
        } else {
            return "Status 403";
        }
    }

        /*if(verify_token!=null && !verify_token.isEmpty() && verify_token.equals(VERIFY_TOKEN)){
            return challenge;
        }else{
            return "Wrong Token";
        }*/





    /*
    @RequestMapping
    public static void main(String[] args) throws IOException {
        // Verify Token Route
        get("/", (request, response) -> {
            BotPlatform platform = new BotPlatform("src/main/java/resources/config.properties");
            platform.getVerifyWebhook().setHubMode((request.queryParams("hub.mode") != null) ? request.queryParams("hub.mode") : "");
            platform.getVerifyWebhook().setHubVerifyToken((request.queryParams("hub.verify_token") != null) ? request.queryParams("hub.verify_token") : "");
            platform.getVerifyWebhook().setHubChallenge((request.queryParams("hub.challenge") != null) ? request.queryParams("hub.challenge") : "");

            if (platform.getVerifyWebhook().challenge()) {
                platform.finish();
                response.status(200);
                return (request.queryParams("hub.challenge") != null) ? request.queryParams("hub.challenge") : "";
            }

            platform.finish();
            response.status(403);
            return "Verification token mismatch";
        });
    }

    /*
    @RequestMapping(value="/messenger", method = RequestMethod.GET)
    public @ResponseBody Messenger getMessenger(@RequestParam("name") String name){

        Item i = itemDao.findOne(name);
        String itemName = i.getMessenger();
        String price = i.getPrice();
        return i;
    }


/*
    @PostMapping(path = "users",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> create(@RequestBody User newUser) {

        User user = userService.save(newUser);
        if (user == null) {
            throw new ServerException();
        } else {
            return new ResponseEntity<>(user, HttpStatus.CREATED);
        }
    }
 /*
    @PostMapping Example
    @PostMapping(path = "users",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> create(@RequestBody User newUser) {

        User user = userService.save(newUser);
        if (user == null) {
            throw new ServerException();
        } else {
            return new ResponseEntity<>(user, HttpStatus.CREATED);
        }
    }
   */

    /*
    @Controller
    @Path("query-params")
    public class QueryParamsController {

        @GET
        public String queryParams(
                @QueryParam("id") long id,
                @QueryParam("name") String name,
                @QueryParam("role") Role role)

    }

    /*
    private void sendReply(String id,String text){
        MessengerResponse response = new MessengerResponse();
        response.setMessage_type("text");
        response.getRecipient().put("id",id);
        response.getMessage().put("text",text);
        HttpEntity<FacebookMessageResponse> entity = new HttpEntity<>(response);
        String result = template.postForEntity(FB_MSG_URL,entity,String.class).getBody();
        logger.info("Message result: {}",result);

    }
     */
