package com.alticci.sequential.controller;

import com.alticci.sequential.constants.AlticciConstants;
import com.alticci.sequential.domain.dto.AlticciOutputDto;
import com.alticci.sequential.service.AlticciService;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = {"Alticci Sequencial Controller"})
@RequestMapping(value = AlticciConstants.BASE_URL)
@CrossOrigin(origins = AlticciConstants.ENABLE_CORS)
public class AlticciController {

    private final AlticciService alticciService;

    public AlticciController(AlticciService alticciService) {
        this.alticciService = alticciService;
    }

    @ApiOperation(
            value = AlticciConstants.SWAGGER_API_OPERATION_VALUE,
            notes = AlticciConstants.SWAGGER_API_OPERATION_NOTES)
    @ApiResponses({
            @ApiResponse(
                    code = 200,
                    message = "Sequence Generated",
                    response = AlticciOutputDto.class,
                    responseContainer = "List"
            )
    })
    @RequestMapping(value = "/{n}", method = RequestMethod.GET)
    public ResponseEntity<String> execute(@PathVariable final int n) throws JsonProcessingException {
        return ResponseEntity.status(HttpStatus.OK).body(alticciService.execute(n));
    }

}
