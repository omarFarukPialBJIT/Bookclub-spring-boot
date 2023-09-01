package com.pial.book_club_organizer.service;
import com.pial.book_club_organizer.model.Book;
import com.pial.book_club_organizer.model.Reader;
import com.pial.book_club_organizer.repository.ReaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReaderService {
    @Autowired
    private ReaderRepository readerRepository;


    public List<Reader> getAllReader() {
        return readerRepository.findAll();
    }
    public Optional<Reader> getReaderById(Integer id) {
        return readerRepository.findById(id);
    }

    public void addReader(Reader reader) {
        readerRepository.save(reader);
    }

    public void deleteReaderById(Integer id) {
        readerRepository.deleteById(id);
    }
}
