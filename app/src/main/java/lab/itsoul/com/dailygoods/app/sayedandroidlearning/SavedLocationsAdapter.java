package lab.itsoul.com.dailygoods.app.sayedandroidlearning;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SavedLocationsAdapter extends RecyclerView.Adapter<SavedLocationsAdapter.MyViewholer> {

    private List<SavedLocations> savedLocationsList;

    public SavedLocationsAdapter(List<SavedLocations> savedLocationsList) {
        this.savedLocationsList = savedLocationsList;

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
                .inflate(R.layout.saved_locations_list_row , parent , false);
        return new MyViewholer(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewholer holder, int position) {

        SavedLocations  savedLocations = savedLocationsList.get(position);
        holder.imageTitle.setText(savedLocations.getItemTitle());
        holder.imageViewSrc.setImageResource(savedLocations.getItemImage());

    }

    @Override
    public int getItemCount() {
        return this.savedLocationsList.size();
    }
}
