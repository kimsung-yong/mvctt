package domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.util.UriComponentsBuilder;

@Getter
@Setter
public class Criteria {
    private int pageNum;
    private int amount;

    private String type;
    private String keyword;
    public Criteria() {
        this(1,10);
    }

    public Criteria(int pageNum, int amount) {
        this.pageNum = pageNum;
        this.amount = amount;
    }

    public String[] getTypeArr() {
        return type == null ? new String[] {} : type.split("");
    }

    public String getListLink(){
        UriComponentsBuilder builder = UriComponentsBuilder.fromPath("")
                .queryParam("pageNum",this.pageNum)
                .queryParam("amount",this.amount);
        return builder.toUriString();
    }
}
