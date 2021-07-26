package az.elixir.social.Domain;

import javax.persistence.*;

@Entity
@Table(name = "FAQS")
public class FAQModel {

@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

private String question;

private String answer;

private String lang;

    public FAQModel() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
}
