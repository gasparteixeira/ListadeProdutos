package edm.rs.senac.com.br.listadeprodutos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private List<String> listaProdutos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaProdutos = new ArrayList<String>();
        listaProdutos.add("Compuador");
        listaProdutos.add("Televisor");
        listaProdutos.add("Microsystem");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                listaProdutos
        );

        ListView listView = (ListView) findViewById(R.id.lista_produtos);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, listaProdutos.get(position).toString(), Toast.LENGTH_SHORT).show();
    }
}
