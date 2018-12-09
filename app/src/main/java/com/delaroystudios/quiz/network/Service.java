package com.delaroystudios.quiz.network;

import com.delaroystudios.quiz.QuestionsModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by delaroy on 4/30/18.
 */

public interface Service {

    @GET("api/json/get/cfZiteCtvm?indent=2")
    Call<List<QuestionsModel>> getQuestions();

}
