
package com.vaadin.example.backend.domain.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "city",
    "cod",
    "message",
    "cnt",
    "days"
})
public class Forecast {

    @JsonProperty("city")
    private City city;
    @JsonProperty("cod")
    private String cod;
    @JsonProperty("message")
    private Double message;
    @JsonProperty("cnt")
    private Integer cnt;
    @JsonProperty("list")
    private java.util.List<Day> days = new ArrayList<Day>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     *     The city
     */
    @JsonProperty("city")
    public City getCity() {
        return city;
    }

    /**
     *
     * @param city
     *     The city
     */
    @JsonProperty("city")
    public void setCity(City city) {
        this.city = city;
    }

    /**
     *
     * @return
     *     The cod
     */
    @JsonProperty("cod")
    public String getCod() {
        return cod;
    }

    /**
     *
     * @param cod
     *     The cod
     */
    @JsonProperty("cod")
    public void setCod(String cod) {
        this.cod = cod;
    }

    /**
     *
     * @return
     *     The message
     */
    @JsonProperty("message")
    public Double getMessage() {
        return message;
    }

    /**
     *
     * @param message
     *     The message
     */
    @JsonProperty("message")
    public void setMessage(Double message) {
        this.message = message;
    }

    /**
     *
     * @return
     *     The cnt
     */
    @JsonProperty("cnt")
    public Integer getCnt() {
        return cnt;
    }

    /**
     *
     * @param cnt
     *     The cnt
     */
    @JsonProperty("cnt")
    public void setCnt(Integer cnt) {
        this.cnt = cnt;
    }

    /**
     *
     * @return
     *     The days
     */
    @JsonProperty("days")
    public java.util.List<Day> getDays() {
        return days;
    }

    /**
     *
     * @param days
     *     The days
     */
    @JsonProperty("days")
    public void setDays(java.util.List<Day> days) {
        this.days = days;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
