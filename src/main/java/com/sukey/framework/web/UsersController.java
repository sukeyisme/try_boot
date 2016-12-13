import com.sukey.framework.Account;
@RestController
public class UsersController{
    @RequestMapping(value = "/1/users", method = RequestMethod.POST)
    public ResponseEntity<String> save(@RequestBody Account accountRequest) {

        Integer accountProfileId = this.service.saveAccount(accountRequest);
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.setLocation(builder.path("/account/{id}").buildAndExpand(accountProfileId).toUri());
        return new ResponseEntity<String>(responseHeaders, HttpStatus.CREATED);
    }

