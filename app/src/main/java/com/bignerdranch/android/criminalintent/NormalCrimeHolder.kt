package com.bignerdranch.android.criminalintent

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bignerdranch.android.criminalintent.databinding.ListItemCrimeBinding

class NormalCrimeHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val crimeTitleTextView: TextView = itemView.findViewById(R.id.crime_title)
    private val crimeDateTextView: TextView = itemView.findViewById(R.id.crime_date)

    fun bind(crime: Crime) {
        crimeTitleTextView.text = crime.title
        crimeDateTextView.text = crime.date.toString()
    }
}