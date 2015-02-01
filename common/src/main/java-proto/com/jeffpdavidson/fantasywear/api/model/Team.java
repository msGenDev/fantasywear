// Code generated by Wire protocol buffer compiler, do not edit.
package com.jeffpdavidson.fantasywear.api.model;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.BOOL;
import static com.squareup.wire.Message.Datatype.STRING;

public final class Team extends Message {

  public static final String DEFAULT_NAME = "";
  public static final Boolean DEFAULT_IS_OWNED_BY_CURRENT_LOGIN = false;
  public static final String DEFAULT_LOGO_URL = "";
  public static final String DEFAULT_SCORE = "";

  @ProtoField(tag = 1, type = STRING)
  public final String name;

  @ProtoField(tag = 2, type = BOOL)
  public final Boolean is_owned_by_current_login;

  @ProtoField(tag = 3, type = STRING)
  public final String logo_url;

  @ProtoField(tag = 4, type = STRING)
  public final String score;

  public Team(String name, Boolean is_owned_by_current_login, String logo_url, String score) {
    this.name = name;
    this.is_owned_by_current_login = is_owned_by_current_login;
    this.logo_url = logo_url;
    this.score = score;
  }

  private Team(Builder builder) {
    this(builder.name, builder.is_owned_by_current_login, builder.logo_url, builder.score);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Team)) return false;
    Team o = (Team) other;
    return equals(name, o.name)
        && equals(is_owned_by_current_login, o.is_owned_by_current_login)
        && equals(logo_url, o.logo_url)
        && equals(score, o.score);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = name != null ? name.hashCode() : 0;
      result = result * 37 + (is_owned_by_current_login != null ? is_owned_by_current_login.hashCode() : 0);
      result = result * 37 + (logo_url != null ? logo_url.hashCode() : 0);
      result = result * 37 + (score != null ? score.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<Team> {

    public String name;
    public Boolean is_owned_by_current_login;
    public String logo_url;
    public String score;

    public Builder() {
    }

    public Builder(Team message) {
      super(message);
      if (message == null) return;
      this.name = message.name;
      this.is_owned_by_current_login = message.is_owned_by_current_login;
      this.logo_url = message.logo_url;
      this.score = message.score;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder is_owned_by_current_login(Boolean is_owned_by_current_login) {
      this.is_owned_by_current_login = is_owned_by_current_login;
      return this;
    }

    public Builder logo_url(String logo_url) {
      this.logo_url = logo_url;
      return this;
    }

    public Builder score(String score) {
      this.score = score;
      return this;
    }

    @Override
    public Team build() {
      return new Team(this);
    }
  }
}
