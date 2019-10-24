package lab.itsoul.com.dailygoods.app.sayedandroidlearning;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter <ItemAdapter.MyViewholer>{


   List<Item> itemList = new ArrayList<>();

    public ItemAdapter( List<Item> itemList) {

        this.itemList = itemList;
    }

   public class MyViewholer extends RecyclerView.ViewHolder {
        ImageView imageViewSrc ;
        TextView imageTitle ;

       public MyViewholer(@NonNull View itemView) {
           super(itemView);
           this.imageViewSrc = itemView.findViewById(R.id.itemImageViewId);
           this.imageTitle =  itemView.findViewById(R.id.itemTextViewId);
       }
   }

    @NonNull
    @Override
    public MyViewholer onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                                    .inflate(R.layout.item_list_row , parent , false);
            return new MyViewholer(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewholer holder, int position) {
        Item item = itemList.get(position);
        holder.imageTitle.setText(item.getItemTitle());
        holder.imageViewSrc.setImageResource(item.getItemImage());

    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}
