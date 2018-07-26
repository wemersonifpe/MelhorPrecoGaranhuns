package com.example.wemerson.melhorpreogaranhuns;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface IProdutosREST {
    @POST("Produtos/webresources/br.ufs.tep.produtos/inserir")
    Call<Void> insereProdutos(@Body Produtos produtos);

    @GET("Produtos/webresources/br.ufs.tep.produtos")
    Call<List<Produtos>> getProdutos();

    @GET("Produtos/webresources/br.ufs.tep.produtos/buscar/{produtos_id}")
    Call<Produtos> getProdutosPorId(@Path("produtos_id") String id);

    @PUT("Produtos/webresources/br.ufs.tep.produtos/editar/{produtos_id}")
    Call<Void> alteraProdutos(@Path("produtos_id") String id, @Body Produtos produtos);

    @DELETE("Produtos/webresources/br.ufs.tep.produtos/remover/{produtos_id}")
    Call<Void> removeProdutos(@Path("produtos_id") String id);

    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://10.0.2.2:8080/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
