package genericType;

public class Country {
    private String name;
    private Integer population;
    private String leader;

    public Country(String name, Integer population, String leader) {
        this.name = name;
        this.population = population;
        this.leader = leader;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", leader='" + leader + '\'' +
                '}';
    }
}
