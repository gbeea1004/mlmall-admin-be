package mlmall.mlmalladminbe.product.controller;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.get;
import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
import static org.springframework.restdocs.payload.PayloadDocumentation.responseFields;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@AutoConfigureMockMvc
@AutoConfigureRestDocs
@SpringBootTest
class ProductControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  void test() throws Exception {
    mockMvc.perform(get("/products")).andExpect(status().isOk())
        .andDo(document("get-products",
            responseFields(fieldWithPath("responseCode").description("응답결과 코드"),
                fieldWithPath("result").description("response"))));
  }
}