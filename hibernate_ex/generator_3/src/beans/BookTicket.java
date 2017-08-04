package beans;

public class BookTicket 
{
	private int id;
	private String movie;
	private String showtime;
	private int seatno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public String getShowtime() {
		return showtime;
	}
	public void setShowtime(String showtime) {
		this.showtime = showtime;
	}
	public int getSeatno() {
		return seatno;
	}
	public void setSeatno(int i) {
		this.seatno = i;
	}

}
