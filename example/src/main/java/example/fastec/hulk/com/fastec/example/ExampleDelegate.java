package example.fastec.hulk.com.fastec.example;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import example.fastec.hulk.com.fastec.R;
import example.fastec.hulk.com.pot_core.delegates.PotDelegate;
import example.fastec.hulk.com.pot_core.net.RestClient;
import example.fastec.hulk.com.pot_core.net.callback.IError;
import example.fastec.hulk.com.pot_core.net.callback.IFailure;
import example.fastec.hulk.com.pot_core.net.callback.IRequest;
import example.fastec.hulk.com.pot_core.net.callback.ISuccess;

/**
 * Created by fuzhi on 2019/3/21
 */
public class ExampleDelegate extends PotDelegate {
    @Override
    public Object setLayout() {
        return R.layout.delegate_example;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {
        testRestClient();
    }

    private void testRestClient() {
        RestClient.builder()
                .url("http://127.0.0.1/index")
                .loader(getContext())
                .success(new ISuccess() {
                    @Override
                    public void onSuccess(String response) {
                        Log.i("fuzhi", "成功");
                        Toast.makeText(getContext(), response, Toast.LENGTH_SHORT).show();
                    }
                })
                .failure(new IFailure() {
                    @Override
                    public void onFailure() {
                        Log.i("fuzhi", "失败");
                    }
                })
                .error(new IError() {
                    @Override
                    public void onError(int code, String msg) {

                    }
                })
                .build()
                .get();
    }
}
