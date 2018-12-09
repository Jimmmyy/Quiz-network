package com.delaroystudios.quiz.network;

import com.delaroystudios.quiz.QuestionsModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by delaroy on 4/30/18.
 */

public interface Service {

    @GET("?id=75cb8be9edf846848d69ca4f0bdc6d51&fbclid=IwAR3XCcOwI5dUrS8e65Ny0nqObhF9ZWk1Ovttla0OVA1Pcizss2lfxvkkwVA")
    Call<List<QuestionsModel>> getQuestions();

}
